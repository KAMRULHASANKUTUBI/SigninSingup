package c.tanvir.signinsingup;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    String PREFERENCE_NAME="database";
    String EMAIL_KEY="email";
    String PHONE_KEY="phone";
    String PASSWORD_KEY="password";

    public Preference(Context context) {
        this.context = context;
        sharedPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }
    public  void saveEmail(String email){
        editor.putString(EMAIL_KEY,email);
        editor.commit();
    }
    public void savePhone(String phone){
        editor.putString(PHONE_KEY,phone);
        editor.commit();
    }
    public void savePassword(String password){
        editor.putString(PASSWORD_KEY,password);
        editor.commit();
    }
    public String retrieveEmail(){
        String email=sharedPreferences.getString(EMAIL_KEY,"Data Not Found");
        return email;
    }
    public  String retrivePhone(){
        String phone=sharedPreferences.getString(PHONE_KEY,"Data Not found");
        return phone;
    }
    public String retrivePassword(){
        String password=sharedPreferences.getString(PASSWORD_KEY,"Data Not found");
        return password;
    }
}
