package control;

/***********************************************************************
 * Module:  Volcomplet.java
 * Author:  simo
 * Purpose: Defines the Class Volcomplet
 ***********************************************************************/

import java.util.*;

/** @pdOid 7a2fb307-d406-402a-acef-c9bd3fbc6606 */
public class Volcomplet {
   /** @pdOid 919674d5-8fbe-4586-99b1-894f8b2ff623 */
   private int numeroVol;
   /** @pdOid 0f0bfb24-31a6-4828-9e05-4df78a713af6 */
   private Date dateArriveVol;
   /** @pdOid 29b55375-5420-4683-9b3f-0034404461f0 */
   private Date dateDepartVol;
   /** @pdOid cba951a6-b5e8-4f49-a1cb-dd36c72f2ffa */
   private String jour;
   
   /** @pdRoleInfo migr=no name=Aeroport assc=arrivee mult=1 */
   public Aeroport arrive;
   /** @pdRoleInfo migr=no name=Aeroport assc=depart mult=1 */
   public Aeroport depart;
   public java.util.Collection escale;
   /** @pdRoleInfo migr=no name=CompagnieAierienne assc=proposevolcomplet mult=1 side=A */
   public CompagnieAierienne compagnieAierienne;
   /** @pdRoleInfo migr=no name=Vol assc=composer mult=1..* side=A */
   public Vol[] vol;
   
   /** @pdOid 560cca11-42d4-488f-890b-0c8eb65a1b82 */
   public void ouvrirReservation() {
      // TODO: implement
   }
   
   /** @pdOid d3092037-4a9e-4d89-842e-27de3a6ce5f9 */
   public void fermerReservation() {
      // TODO: implement
   }
   
   /** @pdOid 65cec2e2-d23c-4ef9-ae3e-02dea23ba05f */
   public double calculerDuree() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default parent getter */
   public CompagnieAierienne getCompagnieAierienne() {
      return compagnieAierienne;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompagnieAierienne */
   public void setCompagnieAierienne(CompagnieAierienne newCompagnieAierienne) {
      if (this.compagnieAierienne == null || !this.compagnieAierienne.equals(newCompagnieAierienne))
      {
         if (this.compagnieAierienne != null)
         {
            CompagnieAierienne oldCompagnieAierienne = this.compagnieAierienne;
            this.compagnieAierienne = null;
            oldCompagnieAierienne.removeVolcomplet(this);
         }
         if (newCompagnieAierienne != null)
         {
            this.compagnieAierienne = newCompagnieAierienne;
            this.compagnieAierienne.addVolcomplet(this);
         }
      }
   }

}