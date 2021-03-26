package com.jorgepinedo.alcuadrado;

public class AlCuadradoPresenter implements AlCuadradoMVP.Presenter{

    private AlCuadradoMVP.View view;
    private AlCuadradoMVP.Model model;

    public AlCuadradoPresenter(AlCuadradoMVP.View view) {
        this.view = view;
        this.model=new AlCuadradoModel(this);
    }

    @Override
    public void doOperation(String number) {
        if (view!=null){
            model.doOperation(number);
        }

    }

    @Override
    public void showResult(String result) {
        if (view!=null) {
            view.showMessage(result);
        }
    }

    @Override
    public void showError(String error) {
        if (view!=null) {
            view.showMessage(error);
        }
    }
}
