package ptit.hoang.saleonline;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ptit.hoang.adapter.LoginAdapter;
import ptit.hoang.fragment.login.LoginFragment;
import ptit.hoang.fragment.login.RegisterFragment;

public class LoginActivity extends AppCompatActivity {
    private final String TAG = LoginActivity.class.getSimpleName();
    private final String LOGIN = "Login";
    private final String REGISTER = "Register";
    private TabLayout tab_login;
    private ViewPager viewPagerLogin;
    private LoginAdapter loginAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tab_login = findViewById(R.id.tab_login);
        viewPagerLogin = findViewById(R.id.viewpager_login);
        setUpViewPager();
        tab_login.setupWithViewPager(viewPagerLogin);
        setTitleTab();
    }

    private void setTitleTab() {
        tab_login.getTabAt(0).setText(REGISTER);
        tab_login.getTabAt(1).setText(LOGIN);
    }

    private void setUpViewPager() {
        loginAdapter = new LoginAdapter(getSupportFragmentManager());
        loginAdapter.addFragment(new RegisterFragment(), RegisterFragment.TAG);
        loginAdapter.addFragment(new LoginFragment(), LoginFragment.TAG);
        viewPagerLogin.setAdapter(loginAdapter);
        viewPagerLogin.setOffscreenPageLimit(2);
    }
}
