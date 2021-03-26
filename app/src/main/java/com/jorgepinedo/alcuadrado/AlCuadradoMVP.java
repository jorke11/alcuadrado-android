package com.jorgepinedo.alcuadrado;

public interface AlCuadradoMVP {
    interface Model{
        void doOperation(String number);
    }

    interface View{
        void showMessage(String message);
        void showError(String error);
    }

    interface Presenter{
        void doOperation(String number);
        void showResult(String result);
        void showError(String error);
    }
}
