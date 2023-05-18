package com.example.dz3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    ArrayList<Contact> arrayList;
    public ContactAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        TextView surname;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void onBind(Contact contact){
            name = itemView.findViewById(R.id.tv_name);
            surname = itemView.findViewById(R.id.txt_surname);
            number = itemView.findViewById(R.id.text_number);
            name.setText(contact.getName());
            surname.setText(contact.getSurname());
            number.setText(contact.getNumber());

        }
    }
}
