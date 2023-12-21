package org.acme.models;

public interface MaterielInterface {
    String getTitle();
    void setTitle(String title);

    String getDescription();
    void setDescription(String description);

    String getContact();
    void setContact(String contact);

    int getPrice();
    void setPrice(int price);

    Status getStatus();
    void setStatus(Status status);
}
