package org.acme.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.acme.models.MaterielModel;
import org.acme.models.Status;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
@Default
@Named
public class MaterielService {

    @Inject
    FlashMessageService flashMessage;



    String title = "Your Materiel";
    String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
    String contact = "06-XX-XX-XX-XX";
    int price = 0;
    Status status = Status.OK;
    public List<MaterielModel> materiels = new ArrayList<MaterielModel>();
    List<MaterielModel> filteredFlawlessList = new ArrayList<MaterielModel>(Arrays.asList());
    


 
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    
    public Status[] getStatusValues() {
        return Status.values();
    }

    public List<MaterielModel> getMateriels() {
        return materiels;
    }
    
    public void setMateriels(List<MaterielModel> materiels) {
        this.materiels = materiels;
    }


    public String createMateriel() {
        MaterielModel materielModel = new MaterielModel(this.title, this.description, this.contact, this.price, this.status);
        this.materiels.add(materielModel);
        this.flashMessage.successMessage("Successfully created. Your " + this.title + " is now for sale for "+ this.price + " $", "success");

        return "sell";
    }
 
      public MaterielModel createMaterielAPI() {
                MaterielModel materielModel = new MaterielModel(this.title, this.description, this.contact, this.price, this.status);
                this.materiels.add(materielModel);
                return materielModel;

       
    }
 
    public List<MaterielModel> showFlawlessList() {
        this.filteredFlawlessList = this.materiels
                .stream()
                .filter(c -> c.getStatus().equals(Status.GOOD))
                .collect(Collectors.toList());
        return filteredFlawlessList;
    }
    
    public List<MaterielModel> showBadList() {
        this.filteredFlawlessList = this.materiels
                .stream()
                .filter(c -> c.getStatus().equals(Status.BAD))
                .collect(Collectors.toList());
        return filteredFlawlessList;
    }
    
    public List<MaterielModel> showAverageList() {
        this.filteredFlawlessList = this.materiels
                .stream()
                .filter(c -> c.getStatus().equals(Status.AVERAGE))
                .collect(Collectors.toList());
        return filteredFlawlessList;
    }
    
    public List<MaterielModel> showGoodConditionList() {
        this.filteredFlawlessList = this.materiels
                .stream()
                .filter(c -> c.getStatus().equals(Status.OK))
                .collect(Collectors.toList());
        return filteredFlawlessList;
    }
    
    public String deleteMateriel(MaterielModel materiel) {
        materiels.remove(materiel);

        this.flashMessage.successMessage(
                "Successfully deleted. Your " + this.title + " is now longer for sale", "success");

        return null;
    }
    


}

