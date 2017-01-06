package control;

/***********************************************************************
 * Module:  Client.java
 * Author:  simo
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid ae006ccf-8048-4688-aecf-b6b728260de1 */
public class Client {
   /** @pdOid 03ea9a01-9cb7-4069-93e9-cc86ddd3200a */
   private String CIN;
   /** @pdOid 743a620b-03ff-4715-8ba3-50c1710e66fa */
   private String prenomClient;
   /** @pdOid 1f2aed22-d82d-4806-ba5a-24059a96f1ec */
   private String adresseClient;
   /** @pdOid eca48181-b7ba-4a93-a8fa-ea352af82f41 */
   private long telClient;
   /** @pdOid bf706df1-db99-4afa-a54c-d2fade9f66f4 */
   private long numFaxClient;
   
   /** le client effectue 0 ou plusieur reservation
    * une reservation concerne unet un seul client
    * constraint frozen */
   /** @pdRoleInfo migr=no name=Reservation assc=effectuer mult=0..* */
   public final Reservation[] reservation;
   
   /** @pdOid 58ee6005-0588-44cd-9227-3b060b076520 */
   public Client() {
      // TODO: implement
   }

}