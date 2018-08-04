package com.tqeil.ice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tqeil.ice.model.user_model;

import java.util.ArrayList;

import static android.support.v7.content.res.AppCompatResources.getDrawable;

public class User_Adapter extends RecyclerView.Adapter<User_Adapter.ViewHolder> {
    Context context;
    ArrayList<user_model> singModels = new ArrayList<>();

    public User_Adapter(Context context, ArrayList<user_model> usermodels) {
        this.context = context;
        this.singModels = usermodels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_user,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        user_model model = singModels.get(position);

//        holder.Userprofile.setImageDrawable(context.getResources().getDrawable(model.User_image));
        holder.Userjob.setText(model.job);
        holder.Username.setText(model.name);
        holder.Usercoment.setText(model.coment);

    }

    @Override
    public int getItemCount() {
        return singModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView Username;
        TextView Userjob;
        TextView Usercoment;
        ImageView Userprofile;
        public ViewHolder(View v) {
            super(v);
            Username = (TextView) v.findViewById(R.id.user_name);
            Userjob = (TextView)v.findViewById(R.id.user_job);
            Usercoment = (TextView)v.findViewById(R.id.user_coment);
            Userprofile = (ImageView) v.findViewById(R.id.userimage);
        }
    }
}


