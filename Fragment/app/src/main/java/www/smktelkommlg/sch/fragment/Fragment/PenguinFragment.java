package www.smktelkommlg.sch.fragment.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import www.smktelkommlg.sch.fragment.R;

public class PenguinFragment extends Fragment {
    public PenguinFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.activity_multiple_penguin, container,false);
        return rootView;
    }
}
