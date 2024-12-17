package ch.walica.temp171224_4tp2_retrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ch.walica.temp171224_4tp2_retrofit.R;
import ch.walica.temp171224_4tp2_retrofit.models.Country;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private List<Country> countries;

    public CountryAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCapital, tvFlag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvCapital = itemView.findViewById(R.id.tvCapital);
            tvFlag = itemView.findViewById(R.id.tvFlag);
        }

        public void bind(Country country) {
            tvName.setText(country.name().common());
            tvCapital.setText(country.capital()[0]);
            tvFlag.setText(country.flag());
        }
    }
}
