package com.hikingcarrot7.model.database;

import com.hikingcarrot7.model.database.utils.FileContentManager;
import com.hikingcarrot7.model.entities.Buyer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerDataAccessService extends DataAccessService<Buyer> {

    private static final int BUYER_ID_INDEX = 0;
    private static final int BUYER_FIRST_NAME_INDEX = 1;
    private static final int BUYER_LAST_NAME_INDEX = 2;
    private static final int BUYER_EMAIL_INDEX = 3;
    private static final int BUYER_PHONE_NUMBER_INDEX = 4;

    public BuyerDataAccessService() {
        super(FileContentManager.BASE_PATH + "buyers.csv");
    }

    @Override public List<Buyer> getAllEntities() {
        try {
            return csvParser.parseContent()
                    .map(registry -> new Buyer(
                    registry[BUYER_ID_INDEX],
                    registry[BUYER_FIRST_NAME_INDEX],
                    registry[BUYER_LAST_NAME_INDEX],
                    registry[BUYER_EMAIL_INDEX],
                    registry[BUYER_PHONE_NUMBER_INDEX]))
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

    @Override public void saveEntities(List<Buyer> buyers) {
        Stream<String[]> content = buyers.stream().map(buyer -> new String[]{
            buyer.getId(),
            buyer.getFirstName(),
            buyer.getLastName(),
            buyer.getEmail(),
            buyer.getPhoneNumber()
        });

        fileContentManager.saveContent(content);
    }

}
