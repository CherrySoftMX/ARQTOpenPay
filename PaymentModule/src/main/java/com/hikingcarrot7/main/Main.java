package com.hikingcarrot7.main;

import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.PostService;
import com.hikingcarrot7.model.services.SellerService;
import com.hikingcarrot7.model.services.exceptions.ServiceException;

/**
 *
 * @author HikingCarrot7
 */
public class Main {

    public static void main(String[] args) throws ServiceException {
        Seller seller1 = new Seller("15001169", "Nicolás", "Canul Ibarra", "ricardo@gmail.com", "9992343446");
        Seller seller2 = new Seller("15001170", "Emmanuel", "Chablé Collí", "emma@gmail.com", "9992344323");
        SellerService sellerService = SellerService.getInstance();
        PostService postService = PostService.getInstance();

        sellerService.insertSeller(seller1);

        Post post = new Post(seller1.getId())
                .setConcepto("EVENTO SUBASTA")
                .setTipoBien("correo")
                .setIdEvento("lkasdf23434sdf")
                .setImporte(15)
                .setFechaAdjudicacion("2020-08-12")
                .setHoraAdjudicacion("12:00AM")
                .setHusoHorario("Africa/Abidjan");

        postService.insertPost(post);
    }

    /**
     * Esto será eliminado en un futuro no tan lejano...
     */
    public static void setup() {
        /*BuyerController buyerController = new BuyerController();
            PaymentController paymentController = new PaymentController();
            PostController postController = new PostController();
            SellerController sellerController = new SellerController();

            Buyer buyer1 = new Buyer("buyer1", "Nicolás", "Canul Ibarra", "ricardoibarra2044@gmail.com", "9992676253");
            Buyer buyer2 = new Buyer("buyer2", "Chito", "Pech Puc", "chitogamemode2014@hotmail.com", "9999954062");

            Seller seller1 = new Seller("seller1", "Emmanuel", "Chablé Collí", "sonbear13@outlook.com", "9991786542");
            Seller seller2 = new Seller("seller2", "Eusebio", "Ajax Santos", "eusebiolinux08@yahoo.com", "9991323445");

            Post post = new Post("post1", seller1)
            .setConcepto("EVENTO SUBASTA")
            .setTipoBien("correo")
            .setIdEvento("lkasdf23434sdf")
            .setImporte(15)
            .setFechaAdjudicacion("2020-08-12")
            .setHoraAdjudicacion("12:00AM")
            .setHusoHorario("Africa/Abidjan");

            Card card = new Card()
            .holderName(seller1.getFirstName() + " " + seller1.getLastName())
            .cardNumber("4111111111111111")
            .cvv2("110")
            .expirationMonth(12)
            .expirationYear(21);

            buyerController.insertBuyer(buyer1);
            buyerController.insertBuyer(buyer2);

            sellerController.insertSeller(seller1);
            sellerController.insertSeller(seller2);

            postController.insertPost(post);

            try {
            paymentController.registerPostWithCreditCard(post, card);
            System.out.println(postController.getAllPaidPost());
            } catch (IOException | OpenpayServiceException | ServiceUnavailableException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }
}
