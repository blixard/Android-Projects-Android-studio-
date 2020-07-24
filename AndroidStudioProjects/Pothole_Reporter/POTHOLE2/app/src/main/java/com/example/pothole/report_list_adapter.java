package com.example.pothole;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class report_list_adapter extends RecyclerView.Adapter <report_list_adapter.report_list_viewholder>  {


    private String [] data;
    public report_list_adapter(String[] data){
        this.data = data;

    }

    @NonNull
    @Override
    public report_list_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.report_list_layout,parent, false);

        return new report_list_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull report_list_viewholder holder, int position) {

        String pqi = data[position];
        holder.pqi_textview.setText(pqi);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class report_list_viewholder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView pqi_textview ;

    public report_list_viewholder(@NonNull View itemView) {

        super(itemView);
        imageView = (ImageView)itemView.findViewById(R.id.imageView);
        pqi_textview = (TextView)itemView.findViewById(R.id.pqi_textview);




    }
}

}
