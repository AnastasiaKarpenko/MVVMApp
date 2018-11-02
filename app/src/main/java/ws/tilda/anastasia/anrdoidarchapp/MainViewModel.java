package ws.tilda.anastasia.anrdoidarchapp;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class MainViewModel extends ViewModel {

    ObservableField<String> userName = new ObservableField<>();

    public void onButtonClicked() {
        UserModel userModel = new UserModel();
        userModel.name= userName.get();
    }
}
