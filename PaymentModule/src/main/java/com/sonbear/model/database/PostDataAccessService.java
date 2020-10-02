package com.sonbear.model.database;

import com.sonbear.model.database.utils.FileContentManager;
import com.sonbear.model.entities.Post;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author HikingCarrot7
 */
public class PostDataAccessService extends DataAccessService<Post> {

    private static final int POST_ID_INDEX = 0;
    private static final int SELLER_ID_INDEX = 1;
    private static final int CONCEPTO_INDEX = 2;
    private static final int TIPO_BIEN_INDEX = 3;
    private static final int ID_EVENTO_INDEX = 4;
    private static final int FECHA_ADJUDICACION_INDEX = 5;
    private static final int HORA_ADJUDICACION_INDEX = 6;
    private static final int HUSO_HORARIO_INDEX = 7;
    private static final int IMPORTE_INDEX = 8;
    private static final int PAID_OUT_INDEX = 9;

    public PostDataAccessService() {
        super(FileContentManager.BASE_PATH + "posts.csv");
    }

    @Override public List<Post> getAllEntities() {
        try {
            return csvParser.parseContent()
                    .map(registry -> new Post(
                    registry[POST_ID_INDEX],
                    registry[SELLER_ID_INDEX],
                    registry[CONCEPTO_INDEX],
                    registry[TIPO_BIEN_INDEX],
                    registry[ID_EVENTO_INDEX],
                    registry[FECHA_ADJUDICACION_INDEX],
                    registry[HORA_ADJUDICACION_INDEX],
                    registry[HUSO_HORARIO_INDEX],
                    Double.parseDouble(registry[IMPORTE_INDEX]),
                    Boolean.parseBoolean(registry[PAID_OUT_INDEX])))
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

    @Override public void saveEntities(List<Post> posts) {
        Stream<String[]> content = posts.stream().map(post -> new String[]{
            post.getId(),
            post.getSellerId(),
            post.getConcepto(),
            post.getTipoBien(),
            post.getIdEvento(),
            post.getFechaAdjudicacion(),
            post.getHoraAdjudicacion(),
            post.getHusoHorario(),
            String.valueOf(post.getImporte()),
            String.valueOf(post.isPaidOut())
        });

        fileContentManager.saveContent(content);
    }

}
