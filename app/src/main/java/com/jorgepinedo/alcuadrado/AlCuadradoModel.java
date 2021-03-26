package com.jorgepinedo.alcuadrado;

public class AlCuadradoModel implements AlCuadradoMVP.Model{

    private AlCuadradoMVP.Presenter presenter;

    public AlCuadradoModel(AlCuadradoMVP.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void doOperation(String number) {
        if(number.equals("")) {
            presenter.showError("El campo no puede estar vacio");
        }else{
            presenter.showResult(String.valueOf(Double.parseDouble(number) * Double.parseDouble(number)));
        }
    }
}
