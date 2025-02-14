package com.wroblewskigk.mazebank.Controllers.Client;

import com.wroblewskigk.mazebank.Models.Model;
import com.wroblewskigk.mazebank.Views.ClientMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case ClientMenuOptions.TRANSACTIONS: {
                    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                    break;
                }
                case ClientMenuOptions.ACCOUNTS: {
                    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                    break;
                }
                default:
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
