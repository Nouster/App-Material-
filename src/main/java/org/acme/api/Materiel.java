package org.acme.api;

import java.util.List;

import org.acme.models.MaterielModel;
import org.acme.models.Status;
import org.acme.services.MaterielService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")

public class Materiel {

    @Inject
    MaterielService materielService;

    @GET
    @Path("/read")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MaterielModel> getMateriel() {

        return materielService.getMateriels();
    }
    

    @POST
    @Path("/create")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public MaterielModel addMateriel(
        @FormParam("title") String title,
        @FormParam("description") String description,
        @FormParam("contact") String contact,
        @FormParam("price") int price,
        @FormParam("state") Status state) {

        MaterielModel materielModel = new MaterielModel(title, description, contact, price, state);

        this.materielService.materiels.add(materielModel);
        this.materielService.setMateriels(this.materielService.materiels);
        return materielModel;
       
    }
    


//   @DELETE
//     @Path("/delete/{id}")
//     public Response deleteMateriel(@PathParam("id") int id) {

//             materielService.deleteMateriel(id);
//             return Response.ok().build();
        
//     }

    
}
