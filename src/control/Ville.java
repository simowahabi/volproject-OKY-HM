package control;

/***********************************************************************
 * Module:  Ville.java
 * Author:  simo
 * Purpose: Defines the Class Ville
 ***********************************************************************/

import java.util.*;

/** @pdOid 340b4467-60f1-4795-8aef-097a85825144 */
public class Ville {
   /** @pdOid 28b957e1-f302-4384-ae4b-6acac3296f6a */
   private int idVille;
   /** @pdOid fb2db020-b604-48e9-93a6-5ccb53fae93d */
   private String nomVille;
   /** @pdOid 9affb9fa-ab59-4dae-8231-4e4bf89e19d6 */
   private int codePostale;
   
   /** @pdRoleInfo migr=no name=Aeroport assc=dessert mult=0..* side=A */
   public Aeroport[] aeroport;

}