package com.sonbear.main;

import com.sonbear.model.entities.Buyer;
import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.PaymentService;
import com.sonbear.model.services.PostService;
import com.sonbear.model.services.SellerService;
import com.sonbear.model.services.exceptions.ServiceException;

/**
 *
 * @author HikingCarrot7
 */
public class Main {

    public static void main(String[] args) throws ServiceException {
        Seller seller1 = new Seller("Nicolás", "Canul Ibarra", "ricardo@gmail.com", "9992343446");
        Seller seller2 = new Seller("Emmanuel", "Chablé Collí", "emma@gmail.com", "9992344323");
        Buyer buyer1 = new Buyer("Axel", "Díaz Santos", "axors@outlook.com", "9992676253");
        SellerService sellerService = SellerService.getInstance();
        PostService postService = PostService.getInstance();
        PaymentService paymentService = PaymentService.getInstance();

        CreditCard card = new CreditCard()
                .holderName(seller1.getFirstName() + " " + seller1.getLastName())
                .cardNumber("4111111111111111")
                .cvc("110")
                .expirationMonth(12)
                .expirationYear(21);

        Post post = postService.getPostById("9702ef29-bb53-4e2a-9a60-fbc21552c7ff");
        // paymentService.publishPostWithCreditCard(post, card);
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
