package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    double result;

    double num1;
    double num2;
    String operator;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button7;

    @FXML
    private Button Button8;

    @FXML
    private Button Button6;

    @FXML
    private Button Button5;

    @FXML
    private Button Button4;

    @FXML
    private Button Button9;

    @FXML
    private Button Button3;

    @FXML
    private Button Button2;

    @FXML
    private Button Button1;

    @FXML
    private Button ButtonSum;

    @FXML
    private Button ButtonDifference;

    @FXML
    private Button ButtonMultiplication;

    @FXML
    private Button ButtonDivision;

    @FXML
    private TextField Output;

    @FXML
    private Button ButtonResult;

    @FXML
    private Button Button0;

    @FXML
    private Button ButtonCE;

    @FXML
    private Button ButtonReverse;

    @FXML
    private Button ButtonDot;

    @FXML
    private Button ButtonBCSP;

    @FXML
    void initialize() {

        Button1.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("1");
                                        result = 0;
                                    } else {
                                        Output.setText(Output.getText() + "1");
                                    }
                                }
                            }
        );
        Button2.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("2");
                                        result = 0;
                                    }
                                    else {
                                        Output.setText(Output.getText() + "2");
                                    }
                                }
                            }
        );
        Button3.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("3");
                                        result = 0;
                                    }
                                    else {
                                        Output.setText(Output.getText() + "3");
                                    }

                                }
                            }
        );
        Button4.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("4");
                                        result = 0;
                                    }
                                    else {
                                        Output.setText(Output.getText() + "4");
                                    }
                                }
                            }
        );
        Button5.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("5");
                                        result = 0;
                                    } else {
                                        Output.setText(Output.getText() + "5");
                                    }
                                }
                            }
        );
        Button6.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("6");
                                        result = 0;
                                    } else {
                                        Output.setText(Output.getText() + "6");
                                    }
                                }
                            }
        );
        Button7.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("7");
                                        result = 0;
                                    } else {
                                        Output.setText(Output.getText() + "7");
                                    }
                                }
                            }
        );
        Button8.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("8");
                                        result = 0;
                                    } else {
                                        Output.setText(Output.getText() + "8");
                                    }
                                }
                            }
        );
        Button9.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("9");
                                        result = 0;
                                    }
                                    else {
                                        Output.setText(Output.getText() + "9");
                                    }
                                }
                            }
        );
        Button0.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                @Override
                                public void handle(javafx.event.ActionEvent event) {
                                    if (result != 0) {
                                        Output.setText("0");
                                        result = 0;
                                    }
                                    else {
                                        Output.setText(Output.getText() + "0");
                                    }
                                }
                            }
        );
        ButtonDot.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event) {
                                      char result[] = Output.getText().toCharArray();
                                      for (int i = 0; i < result.length; i++) {
                                          if (result[i] == '.') {
                                              return;
                                          }
                                      }
                                      if (Output.getText() == null) {
                                          Output.setText("0.");
                                      } else {
                                          Output.setText(Output.getText() + ".");
                                      }
                                  }
                              }
        );
        ButtonReverse.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                      @Override
                                      public void handle(javafx.event.ActionEvent event) {
                                          if (!(Output.getText().startsWith("-"))) {
                                              Output.setText("-" + Output.getText());
                                          }
                                      }
                                  }
        );
        ButtonSum.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                  @Override
                                  public void handle(javafx.event.ActionEvent event) {
                                      num1 = Double.parseDouble(Output.getText());
                                      operator = "+";
                                      Output.setText("");
                                  }

                              }
        );
        ButtonDifference.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                         @Override
                                         public void handle(javafx.event.ActionEvent event) {
                                             num1 = Double.parseDouble(Output.getText());
                                             operator = "-";
                                             Output.setText("");
                                         }
                                     }
        );
        ButtonDivision.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                       @Override
                                       public void handle(javafx.event.ActionEvent event) {
                                           num1 = Double.parseDouble(Output.getText());
                                           operator = "/";
                                           Output.setText("");
                                       }
                                   }
        );
        ButtonCE.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                 @Override
                                 public void handle(javafx.event.ActionEvent event) {
                                     num1 = 0;
                                     num2 = 0;
                                     result = 0;

                                     Output.setText("");
                                 }
                             }
        );
        ButtonMultiplication.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                             @Override
                                             public void handle(javafx.event.ActionEvent event) {
                                                 num1 = Double.parseDouble(Output.getText());
                                                 operator = "*";
                                                 Output.setText("");
                                             }
                                         }
        );
        ButtonResult.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                                     @Override
                                     public void handle(javafx.event.ActionEvent event) {
                                         num2 = Double.parseDouble(Output.getText());
                                         switch (operator) {
                                             case "+":
                                                 result = num1 + num2;
                                                 break;
                                             case "-":
                                                 result = (num1 - num2);
                                                 break;
                                             case "*":
                                                 result = (num1 * num2);
                                                 break;
                                             case "/":
                                                 result = (num1 / num2);
                                                 break;
                                         }

                                         double remainder = result - (int) result;
                                         if (remainder == 0) {
                                             Output.setText(String.format("%.0f", result));
                                         } else {
                                             Output.setText(Double.toString(result));
                                         }

                                     }
                                 }
        );
        ButtonBCSP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StringBuilder sb = new StringBuilder(Output.getText());

                if (Output.getText() != null && !Output.getText().equals("")) {
                    Output.setText("" + sb.deleteCharAt(Output.getText().length() - 1));
                }
            }
        });
    }

}
