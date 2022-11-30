package com.example.apptruyen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptruyen.R;
import com.example.apptruyen.model.Theloai;

import java.util.List;

public class adapter_phanloai extends RecyclerView.Adapter<adapter_phanloai.recyclerViewHoder> {

    List<Theloai>dstl;
    public adapter_phanloai(List<Theloai>dstl){
        this.dstl=dstl;
    }
    @NonNull
    @Override
    public adapter_phanloai.recyclerViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new recyclerViewHoder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_phanloai,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_phanloai.recyclerViewHoder holder, int position) {
        holder.setDate(dstl.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class recyclerViewHoder extends RecyclerView.ViewHolder{
        TextView tentl;
        public recyclerViewHoder(@NonNull View itemView) {
            super(itemView);
            tentl=itemView.findViewById(R.id.tv_item_phanloai);
        }
        void setDate(Theloai tl){
            tentl.setText(tl.getTenTheLoai());
        }
    }
}
