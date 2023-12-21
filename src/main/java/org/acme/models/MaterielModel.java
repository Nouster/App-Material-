package org.acme.models;

public class MaterielModel {

    String title;
    String description;
    String contact;
    int price;
    Status status;
    

    public MaterielModel(String title, String description, String contact, int price, Status status) {
        this.title = title;
        this.description = description;
        this.contact = contact;
        this.price = price;
        this.status = status;
    }

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

    @Override
    public String toString() {
        return "MaterielModel [title=" + title + ", description=" + description + ", contact=" + contact + ", price="
                + price + ", status=" + status + "]";
    }


}
