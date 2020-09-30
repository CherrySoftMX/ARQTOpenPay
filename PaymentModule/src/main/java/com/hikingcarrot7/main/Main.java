package com.hikingcarrot7.main;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.openpay.client.BankAccount;
import mx.openpay.client.Payout;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.transactions.CreateBankPayoutParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author HikingCarrot7
 */
public class Main {

    public static void main(String[] args) {
        try {
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
            OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx", "sk_b226df654f7147a685a61d91910a4c0f", "mdhyajxaybgiosonjgqt");
            /*CreateTransferParams request = new CreateTransferParams();
            request.toCustomerId("abnuwbdhkhnz9ojfepvy");
            request.amount(new BigDecimal("10.00"));
            request.description("Transferencia de Emmanuel a Ajax");
            request.orderId("idOrdExt-0101");*/

 /*BankAccount request = new BankAccount();
            request.holderName("Emmanuel Chablé Collí");
            request.alias("Cuenta principal");
            request.clabe("000000000000000000");

            request = api.bankAccounts().create("az2asuczhjduxxu3dc2k", request);*/
            // request = api.cards().create("az2asuczhjduxxu3dc2k", request);
            // Transfer transfer = api.transfers().create("az2asuczhjduxxu3dc2k", request);
            BankAccount bankAccount = api.bankAccounts().get("az2asuczhjduxxu3dc2k", "bjjedksmqnptc944cffn");

            CreateBankPayoutParams request = new CreateBankPayoutParams();
            request.bankAccountId(bankAccount.getId()); // = destination_id
            request.amount(new BigDecimal("10.50"));
            request.description("Retiro de saldo semanal");
            request.orderId("oid-00021");

            Payout payout = api.payouts().create("az2asuczhjduxxu3dc2k", request);

        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
