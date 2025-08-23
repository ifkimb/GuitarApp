package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterItensGuitarra extends FragmentStateAdapter {
    public AdapterItensGuitarra(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new GuitarraFragment();
            case 1:
                return new AcessoriosFragment();
            case 2:
                return new LojaFragment();
            default:
                return new GuitarraFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
