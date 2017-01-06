package control;

/***********************************************************************
 * Module:  CompagnieAierienne.java
 * Author:  simo
 * Purpose: Defines the Class CompagnieAierienne
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d3a12c7-0a90-4b86-bc30-10af7c61474c */
public class CompagnieAierienne {
   /** @pdOid dde94089-0e1b-44fa-9210-903823007949 */
   private int idComp;
   /** @pdOid 22e25045-6ac7-49a0-b7ef-a34185711abd */
   private String nomCompAirien;
   
   /** @pdRoleInfo migr=no name=Volcomplet assc=proposevolcomplet coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Volcomplet> volcomplet;
   /** @pdRoleInfo migr=no name=Vol assc=proposevol coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Vol> vol;
   /** @pdRoleInfo migr=no name=Client assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Client> client;
   
   /** @pdOid 89e28564-7cf2-48b7-abf9-3cc76b0316fa */
   public CompagnieAierienne() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Volcomplet> getVolcomplet() {
      if (volcomplet == null)
         volcomplet = new java.util.HashSet<Volcomplet>();
      return volcomplet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVolcomplet() {
      if (volcomplet == null)
         volcomplet = new java.util.HashSet<Volcomplet>();
      return volcomplet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVolcomplet */
   public void setVolcomplet(java.util.Collection<Volcomplet> newVolcomplet) {
      removeAllVolcomplet();
      for (java.util.Iterator iter = newVolcomplet.iterator(); iter.hasNext();)
         addVolcomplet((Volcomplet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVolcomplet */
   public void addVolcomplet(Volcomplet newVolcomplet) {
      if (newVolcomplet == null)
         return;
      if (this.volcomplet == null)
         this.volcomplet = new java.util.HashSet<Volcomplet>();
      if (!this.volcomplet.contains(newVolcomplet))
      {
         this.volcomplet.add(newVolcomplet);
         newVolcomplet.setCompagnieAierienne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldVolcomplet */
   public void removeVolcomplet(Volcomplet oldVolcomplet) {
      if (oldVolcomplet == null)
         return;
      if (this.volcomplet != null)
         if (this.volcomplet.contains(oldVolcomplet))
         {
            this.volcomplet.remove(oldVolcomplet);
            oldVolcomplet.setCompagnieAierienne((CompagnieAierienne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVolcomplet() {
      if (volcomplet != null)
      {
         Volcomplet oldVolcomplet;
         for (java.util.Iterator iter = getIteratorVolcomplet(); iter.hasNext();)
         {
            oldVolcomplet = (Volcomplet)iter.next();
            iter.remove();
            oldVolcomplet.setCompagnieAierienne((CompagnieAierienne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Vol> getVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVol */
   public void setVol(java.util.Collection<Vol> newVol) {
      removeAllVol();
      for (java.util.Iterator iter = newVol.iterator(); iter.hasNext();)
         addVol((Vol)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVol */
   public void addVol(Vol newVol) {
      if (newVol == null)
         return;
      if (this.vol == null)
         this.vol = new java.util.HashSet<Vol>();
      if (!this.vol.contains(newVol))
         this.vol.add(newVol);
   }
   
   /** @pdGenerated default remove
     * @param oldVol */
   public void removeVol(Vol oldVol) {
      if (oldVol == null)
         return;
      if (this.vol != null)
         if (this.vol.contains(oldVol))
            this.vol.remove(oldVol);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVol() {
      if (vol != null)
         vol.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Client> getClient() {
      if (client == null)
         client = new java.util.HashSet<Client>();
      return client;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorClient() {
      if (client == null)
         client = new java.util.HashSet<Client>();
      return client.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newClient */
   public void setClient(java.util.Collection<Client> newClient) {
      removeAllClient();
      for (java.util.Iterator iter = newClient.iterator(); iter.hasNext();)
         addClient((Client)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClient */
   public void addClient(Client newClient) {
      if (newClient == null)
         return;
      if (this.client == null)
         this.client = new java.util.HashSet<Client>();
      if (!this.client.contains(newClient))
         this.client.add(newClient);
   }
   
   /** @pdGenerated default remove
     * @param oldClient */
   public void removeClient(Client oldClient) {
      if (oldClient == null)
         return;
      if (this.client != null)
         if (this.client.contains(oldClient))
            this.client.remove(oldClient);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllClient() {
      if (client != null)
         client.clear();
   }

}