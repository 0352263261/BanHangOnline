package ptit.hoang.fragment.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import ptit.hoang.saleonline.R;

public class LoginFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = LoginFragment.class.getSimpleName();
    private EditText txt_login_nick;
    private EditText txt_login_pass;
    private Button btn_login;
    private Button txt_forgetPass;
    private Button btn_login_by_phone;
    private LoginButton btn_login_by_fb;
    private CallbackManager mCallbackManager;

    public LoginFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        initView(view);
        btn_login_by_fb.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAG, "Login by FB success");
            }

            @Override
            public void onCancel() {
                Log.d(TAG, "Login by FB cancel");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d(TAG, "Login by FB error");
            }
        });
        return view;
    }

    private void initView(View view) {
        txt_login_nick = view.findViewById(R.id.txt_login_nick);
        txt_login_pass = view.findViewById(R.id.txt_login_pass);
        btn_login = view.findViewById(R.id.btn_login);
        txt_forgetPass = view.findViewById(R.id.txt_forgetPass);
        btn_login_by_phone = view.findViewById(R.id.btn_login_by_phone);
        btn_login_by_fb = view.findViewById(R.id.btn_login_by_fb);

        btn_login.setOnClickListener(this);
        txt_forgetPass.setOnClickListener(this);
        btn_login_by_phone.setOnClickListener(this);

        mCallbackManager = CallbackManager.Factory.create();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                //TODO: Login
                break;
            case R.id.txt_forgetPass:
                //TODO: forgetPass
                break;
            case R.id.btn_login_by_phone:
                //TODO: Login by SMS
                break;
            default:
                break;
        }
    }
}
