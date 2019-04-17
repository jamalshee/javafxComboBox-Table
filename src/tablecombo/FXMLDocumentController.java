/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablecombo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author bett
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView< TableBean> tableView;

    @FXML
    TableColumn< TableBean, ComboBox> gender;

    @FXML
    TableColumn< TableBean, ComboBox> name;

    ObservableList<TableBean> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBox<String> gender_combo = new ComboBox<>();
        gender_combo.getItems().add("Male");
        gender_combo.getItems().add("Female");
        gender_combo.getItems().add("Other");

        ComboBox<String> gender_combo1 = new ComboBox<>();
        gender_combo1.getItems().add("Male");
        gender_combo1.getItems().add("Female");
        gender_combo1.getItems().add("Other");
        list.add(new TableBean("Sharon", gender_combo1));

        ComboBox<String> gender_combo2 = new ComboBox<>();
        gender_combo2.getItems().add("Male");
        gender_combo2.getItems().add("Female");
        gender_combo2.getItems().add("Other");
        list.add(new TableBean("Wangu", gender_combo2));

        ComboBox<String> gender_combo3 = new ComboBox<>();
        gender_combo3.getItems().add("Male");
        gender_combo3.getItems().add("Female");
        gender_combo3.getItems().add("Other");
        list.add(new TableBean("Francis", gender_combo3));

        list.add(new TableBean("Bett", gender_combo));
        
        
        

        tableView.setItems(list);

        gender.setCellValueFactory(new PropertyValueFactory<TableBean, ComboBox>("gender"));
        name.setCellValueFactory(new PropertyValueFactory<TableBean, ComboBox>("name"));
    }

}
