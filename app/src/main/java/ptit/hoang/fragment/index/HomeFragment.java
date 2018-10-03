package ptit.hoang.fragment.index;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import ptit.hoang.saleonline.R;

public class HomeFragment extends Fragment {
    private RecyclerView rcl_goiy;
    private GridView grid_timkiemphobien;
    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rcl_goiy = view.findViewById(R.id.rcl_goiy);
        grid_timkiemphobien = view.findViewById(R.id.grid_timkiemphobien);
    }
}
