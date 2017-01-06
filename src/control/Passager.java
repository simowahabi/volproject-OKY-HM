package control;

/***********************************************************************
 * Module:  Passager.java
 * Author:  simo
 * Purpose: Defines the Class Passager
 ***********************************************************************/

import java.util.*;

/** @pdOid 64dce591-5e8b-4a14-80c6-95c6cfd3fcc6 */
public class Passager {
   /** @pdOid e531adc4-ab61-4685-9923-0cf108499abe */
   private String nomPassager;
   /** @pdOid 6acc9342-38ec-4c13-80be-8efe1f414863 */
   private String prenomPassager;
   
   /** @pdRoleInfo migr=no name=Reservation assc=concerne mult=1 side=A */
   public Reservation reservation;
   
   /** @pdOid e6e9f8bf-d66c-487b-b0c4-222b4f37272c */
   public Passager() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Reservation getReservation() {
      return reservation;
   }
   
   /** @pdGenerated default parent setter
     * @param newReservation */
   public void setReservation(Reservation newReservation) {
      if (this.reservation == null || !this.reservation.equals(newReservation))
      {
         if (this.reservation != null)
         {
            Reservation oldReservation = this.reservation;
            this.reservation = null;
            oldReservation.removePassager(this);
         }
         if (newReservation != null)
         {
            this.reservation = newReservation;
            this.reservation.addPassager(this);
         }
      }
   }

}