package com.example.apptruyen.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptruyen.R;
import com.example.apptruyen.model.Truyen;

import java.util.List;

public class adapter_truyen extends RecyclerView.Adapter<adapter_truyen.recyclerViewHoder> {
    private List<Truyen> dsTruyen;

    public adapter_truyen(List<Truyen>dsTruyen){
        this.dsTruyen=dsTruyen;
    }

    @NonNull
    @Override
    public recyclerViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new recyclerViewHoder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_truyen,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_truyen.recyclerViewHoder holder, int position) {
        holder.setData(dsTruyen.get(position));
    }

    @Override
    public int getItemCount() {
        return dsTruyen.size();
    }

    public class recyclerViewHoder extends RecyclerView.ViewHolder {

        ImageView hinh;
        TextView ten;
        public recyclerViewHoder(@NonNull View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.tv_item_tentruyen);
            hinh=itemView.findViewById(R.id.iv_item_hinhtruyen);
        }
        void setData(Truyen tr){
            ten.setText(tr.getTentruyen());
//            byte[] bt= Base64.decode(tr.getHinh(),0);
//            //byte to Bitmap
//            Bitmap bm = BitmapFactory.decodeByteArray(bt,0,bt.length,null);
//            hinh.setImageBitmap(bm);
        }
    }
}
