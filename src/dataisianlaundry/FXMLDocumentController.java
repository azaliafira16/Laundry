/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataisianlaundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;


/**
 *
 * @author azalia
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Label label;

    @FXML
    private TextField idnama;

    @FXML
    private TextField idalamat;

    @FXML
    private TextField idcuci;

    @FXML
    private TextField idnomor;

    @FXML
    private TextField idtanggal;

    @FXML
    private ToggleGroup pilihan1;


    @FXML
    private Button proses;

    @FXML
    private Button hapus;

    @FXML
    private TextArea idhasil;
    @FXML
    private RadioButton idck;
    @FXML
    private RadioButton idcks;
    @FXML
    private RadioButton ids;

    @FXML
    void hapus(ActionEvent event) {

    }

    @FXML
    void proses(ActionEvent event) {
    
    String paket;
        int harga = 0;
        
        
        
        if(idnama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nama");
        }else if(idalamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Alamat");
        }else if(idcuci.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Berat laundry");
        }else if(idnomor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nomor Telepon");
        }else if (idtanggal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Tanggal ambil");
        }
        if(idck.isSelected())
        paket = "Cuci Kering";
        else if (idcks.isSelected())
        paket = "Cuci Kering Setrika";
        else if (ids.isSelected())
        paket = "Setrika";
        else
        paket = "";
        
        if(!(idck.isSelected() || idcks.isSelected() || ids.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap pilih paket layanan");
        }else{
        String nama = idnama.getText();
        String alamat = idalamat.getText();
        String berat = idcuci.getText() + " kg";
        String tanggal = idtanggal.getText();
        
        int hitung = Integer.parseInt(idcuci.getText());
        
        if (idck.isSelected())
        harga = hitung*5000;
        else if (idcks.isSelected())
        harga = hitung*8000;
        else if (ids.isSelected())
        harga = hitung*4000;
        String nohp = idnomor.getText();
        
            idhasil.setText("Nama : " +nama+"\n"+"Alamat : " +alamat+"\n"+"Berat Laundry : " +berat+"\n"+"Nomor Telepon : "+ 
                nohp+"\n"+"Pilihan Paket : " +paket+"\n"+"Tanggal Pengambilan : "+tanggal+"\n"+"Pembayaran yang harus dibayar : Rp. " +harga);              
        }        
        

    }
    
    @FXML
    void hapusIsian(ActionEvent event) {
        
        idnama.setText("");
        idalamat.setText("");
        idcuci.setText("");
        idnomor.setText("");
        idck.setSelected(false);
        idcks.setSelected(false);
        ids.setSelected(false); 
        idtanggal.setText("");
        idhasil.setText("");
        
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
