package in.masukang.phonebook.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.masukang.phonebook.R;
import in.masukang.phonebook.entity.Contact;

/**
 * Created by teresa on 3/19/2016.
 */
public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {
    ArrayList<Contact> contact;

    public ContactListAdapter(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact current = contact.get(position);
        holder.name.setText(current.getName());
        holder.phone.setText(current.getPhone());
        holder.email.setText(current.getEmail());
    }

    @Override
    public int getItemCount() {
        return contact.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView phone;
        TextView email;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text_view_nama);
            phone = (TextView) itemView.findViewById(R.id.text_view_phone);
            email = (TextView) itemView.findViewById(R.id.text_view_email);
        }
    }
}
