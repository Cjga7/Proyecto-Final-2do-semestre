package com.Cjga7;

import com.Cjga7.dao.ClienteDao;
import com.Cjga7.dao.CocheDao;
import com.Cjga7.dao.RevisionDao;
import com.Cjga7.model.Cliente;
import com.Cjga7.model.Coche;
import com.Cjga7.model.Revision;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Cliente cliente = new Cliente("1450", "Carlos Peréz", "Cochabamba", "Av. Ayacucho #2231", 74452229);
        //Cliente laura = new Cliente("1451", "Carlos Peréz", "Cochabamba", "Av. Ayacucho #2231", 74452229);
        //Coche ferrari2 = new Coche ("AH0122","Ferrari","TH800","rojo",200004,"1451");
        //Coche mercedes = new Coche ("AH0142","Ferrari","TH800","rojo",200004,"1451");
        Cliente beto = new Cliente("8989", "Bryan EScalera", "BEni", "Av.Roma ", 12358);
        Coche mercedes = new Coche ("AGMP78","Ferrari","TH800","azul",200004,beto);
        Revision tecnica1 = new Revision("5789","sirve","Correcto","Cambiados",mercedes);

        ClienteDao clienteDao = new ClienteDao();
        CocheDao cocheDao = new CocheDao();
        RevisionDao revisionDao = new RevisionDao();

        //CREATE
        //clienteDao.addCliente(laura);
        clienteDao.addCliente(beto);
        //cocheDao.addCoche(ferrari);
        cocheDao.addCoche(mercedes);

        revisionDao.addRevision(tecnica1);

        //READ
        //List<Cliente> clientes = clienteDao.getAllClientes();
        //for (int i = 0; i < clientes.size(); i++){
        //    Cliente cliente = clientes.get(i);

        //    System.out.println(cliente);
        //}

        /*
        List<Coche> coches = cocheDao.getAllCoches();
        for (int i = 0; i < coches.size(); i++){
            Coche coche = coches.get(i);

            System.out.println(coche);
        }
         */

        /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i=0; i< revisiones.size(); i++){
            Revision revision = revisiones.get(i);

            System.out.println(revision);
        }
         */


        //UPDATE
        //Cliente cliente = new Cliente("1450", "Fenando Torrico", "La Paz", "Av. 6Agosto #2231", 73772229);
        //clienteDao.updateCliente(cliente);

        //Coche coche = new Coche ("AH0142" , "tOHSIBApowa" , "II9s11", "Negro", 12000,"1451");
        //cocheDao.updateCoche(coche);

        //Revision revision = new Revision("29994", "Correctos", "Correcto", "Repuestos", mercedes);
        //revisionDao.updateRevision(revision);


        //DELETE
        //clienteDao.deleteCliente("1456-1B");
        //clienteDao.deleteCliente("1450");
        //cocheDao.deleteCoche("AH0142");
        //revisionDao.deleteRevision("29994");
    }
}
