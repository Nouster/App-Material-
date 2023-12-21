package org.acme.api;

import java.util.List;

import org.acme.models.MaterielModel;
import org.acme.services.MaterielService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
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
    

//  @POST
// @Path("/create")
// @Produces(MediaType.APPLICATION_JSON)
// public MaterielModel createMateriel(MaterielModel materielModel) {
//     return materielService.createMateriel(materielModel);
// }

    
    @DELETE
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMateriel(MaterielModel materielModel) {
    }


    
}
