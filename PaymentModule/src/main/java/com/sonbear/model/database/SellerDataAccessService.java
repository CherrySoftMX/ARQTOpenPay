package com.sonbear.model.database;

import com.sonbear.model.database.utils.FileContentManager;
import com.sonbear.model.entities.Seller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Sonbear
 */
public class SellerDataAccessService extends DataAccessService<Seller> {

    private static final int SELLER_ID_INDEX = 0;
    private static final int SELLER_FIRST_NAME_INDEX = 1;
    private static final int SELLER_LAST_NAME_INDEX = 2;
    private static final int SELLER_EMAIL_INDEX = 3;
    private static final int SELLER_PHONE_NUMBER_INDEX = 4;

    public SellerDataAccessService() {
        super(FileContentManager.BASE_PATH + "sellers.csv");
    }

    @Override public List<Seller> getAllEntities() {
        try {
            return csvParser.parseContent()
                    .map(registry -> new Seller(
                    registry[SELLER_ID_INDEX],
                    registry[SELLER_FIRST_NAME_INDEX],
                    registry[SELLER_LAST_NAME_INDEX],
                    registry[SELLER_EMAIL_INDEX],
                    registry[SELLER_PHONE_NUMBER_INDEX]))
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

    @Override public void saveEntities(List<Seller> sellers) {
        Stream<String[]> content = sellers.stream().map(seller -> new String[]{
            seller.getId(),
            seller.getFirstName(),
            seller.getLastName(),
            seller.getEmail(),
            seller.getPhoneNumber()
        });

        fileContentManager.saveContent(content);
    }

}
