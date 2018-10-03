package ptit.hoang.fragment.index;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ptit.hoang.adapter.AccountAdapter;
import ptit.hoang.entity.FunctionAccount;
import ptit.hoang.io.IAccountFunction;
import ptit.hoang.saleonline.LoginActivity;
import ptit.hoang.saleonline.R;

public class AccountFragment extends Fragment implements View.OnClickListener{
    private final String TAG = AccountFragment.class.getSimpleName();
    private ConstraintLayout ct_book;
    private ConstraintLayout ct_like;
    private ConstraintLayout ct_watch;
    private ConstraintLayout ct_gioithieu;
    private ConstraintLayout ct_wallet;
    private ConstraintLayout ct_xu;
    private ConstraintLayout ct_danhgia;
    private ConstraintLayout ct_acc;
    private ConstraintLayout ct_help;
    public AccountFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        ct_book = view.findViewById(R.id.ct_book);
        ct_like = view.findViewById(R.id.ct_like);
        ct_watch = view.findViewById(R.id.ct_watch);
        ct_gioithieu = view.findViewById(R.id.ct_gioithieu);
        ct_wallet = view.findViewById(R.id.ct_wallet);
        ct_xu = view.findViewById(R.id.ct_xu);
        ct_danhgia = view.findViewById(R.id.ct_danhgia);
        ct_acc = view.findViewById(R.id.ct_acc);
        ct_help = view.findViewById(R.id.ct_help);

        ct_book.setOnClickListener(this);
        ct_like.setOnClickListener(this);
        ct_watch.setOnClickListener(this);
        ct_gioithieu.setOnClickListener(this);
        ct_wallet.setOnClickListener(this);
        ct_xu.setOnClickListener(this);
        ct_danhgia.setOnClickListener(this);
        ct_acc.setOnClickListener(this);
        ct_help.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ct_book:
                show();
                break;
            case R.id.ct_like:
                break;
            case R.id.ct_watch:
                break;
            case R.id.ct_gioithieu:
                break;
            case R.id.ct_wallet:
                break;
            case R.id.ct_xu:
                break;
            case R.id.ct_danhgia:
                break;
            case R.id.ct_acc:
                break;
            case R.id.ct_help:
                break;
        }
    }

    private void show() {
        Intent intent = new Intent(getContext(), LoginActivity.class);
        startActivity(intent);
    }
}
