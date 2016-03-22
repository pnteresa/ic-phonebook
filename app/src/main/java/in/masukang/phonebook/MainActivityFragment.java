package in.masukang.phonebook;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.masukang.phonebook.adapter.ContactListAdapter;
import in.masukang.phonebook.entity.Contact;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(container.getContext());
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        ContactListAdapter adapter = new ContactListAdapter(getDummyContact());
        recyclerView.setAdapter(adapter);
        return v;


    }

    public ArrayList<Contact> getDummyContact() {
        ArrayList<Contact> list = new ArrayList<>();
        list.add(new Contact("Tere","0897216","a@a.com"));
        list.add(new Contact("Adsa","5342","a@b.com"));
        list.add(new Contact("TFeeere","42323","c@a.com"));
        return list;
    }
}
