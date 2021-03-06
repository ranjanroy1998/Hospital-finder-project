package com.example.finder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RegisterAdapter extends RecyclerView.Adapter<RegisterAdapter.registerViewHolder>  {
    private Context mctx;
    private List<Register> registerList;

    public RegisterAdapter(Context mctx, List<Register> registerList) {
        this.mctx = mctx;
        this.registerList = registerList;
    }

    @NonNull
    @Override
    public registerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(mctx);
        View view=inflater.inflate(R.layout.list_layout,viewGroup, false);
        registerViewHolder holder=new registerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull registerViewHolder holder, int i) {
        Register register=registerList.get(i);
        holder.te1.setText(register.getH_name());
        holder.te2.setText(register.getContact());
        holder.te3.setText(register.getSpeciality());
        holder.te4.setText(register.getAddress() + ", " + register.getArea() + ", "  + register.getCity() + ", (" + register.getPincode() + ")");

    }

    @Override
    public int getItemCount() {
        return registerList.size();
    }

    class registerViewHolder extends RecyclerView.ViewHolder{

        TextView te1,te2,te3,te4;
        public registerViewHolder(@NonNull View itemView) {
            super(itemView);
            te1=itemView.findViewById(R.id.t1);
            te2=itemView.findViewById(R.id.t2);
            te3=itemView.findViewById(R.id.t3);
            te4=itemView.findViewById(R.id.t4);

        }
    }
}
