package ptit.hoang.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ptit.hoang.entity.FunctionAccount;
import ptit.hoang.io.IAccountFunction;
import ptit.hoang.saleonline.R;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private List<FunctionAccount> functionAccountList;
    private IAccountFunction iAccountFunction;
    private Context mContext;

    public AccountAdapter(List<FunctionAccount> functionAccountList, IAccountFunction iAccountFunction) {
        this.functionAccountList = functionAccountList;
        this.iAccountFunction = iAccountFunction;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_function_account, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        int idIcon = mContext.getResources().getIdentifier(functionAccountList.get(position).getNameIcon(), "drawable", mContext.getPackageName());
        holder.icon_function_account.setImageResource(idIcon);
        holder.function_acc.setText(functionAccountList.get(position).getFunction());
        holder.function_detail.setText(functionAccountList.get(position).getFunctionDetail());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iAccountFunction != null){
                    holder.constraintLayout.setBackgroundColor(Color.parseColor("#E0E0E0"));
                    iAccountFunction.onClickItemFunctionAc(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return functionAccountList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout constraintLayout;
        private ImageView icon_function_account;
        private TextView function_acc;
        private TextView function_detail;

        public ViewHolder(View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.root_item_function_ac);
            icon_function_account = itemView.findViewById(R.id.icon_function_account);
            function_acc = itemView.findViewById(R.id.function_acc);
            function_detail = itemView.findViewById(R.id.function_detail);
        }
    }
}
