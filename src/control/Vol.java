package control;

/***********************************************************************
 * Module:  Vol.java
 * Author:  simo
 * Purpose: Defines the Class Vol
 ***********************************************************************/

import java.util.*;

/** @pdOid 858aabbe-bf81-4377-bcb0-3100bb8d0ff9 */
public class Vol {
   /** @pdOid 106837a5-38fd-45d5-b539-d5657bd6a506 */
   private Date datedepart;
   /** @pdOid 29b45cde-8486-46ff-9e06-8bddcfe51a6b */
   private Date datearive;
   /** @pdOid 58774ad3-cab5-4d53-81a7-2879cd65f295 */
   private int idVol;
   
   /** @pdRoleInfo migr=no name=Reservation assc=reservationVol coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=Volcomplet assc=composer mult=1 */
   public Volcomplet volcomplet;
   /** @pdRoleInfo migr=no name=CompagnieAierienne assc=proposevol mult=1..* side=A */
   public CompagnieAierienne[] compagnieAierienne;
   
   /** @pdOid 4288151f-dadf-4e9e-95d5-4186f4fcb772 */
   public Double calculeDuree() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
      {
         this.reservation.add(newReservation);
         newReservation.setVol(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
         {
            this.reservation.remove(oldReservation);
            oldReservation.setVol((Vol)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
      {
         Reservation oldReservation;
         for (java.util.Iterator iter = getIteratorReservation(); iter.hasNext();)
         {
            oldReservation = (Reservation)iter.next();
            iter.remove();
            oldReservation.setVol((Vol)null);
         }
      }
   }

}