package www.smktelkommlg.sch.fragment.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import www.smktelkommlg.sch.fragment.R;

public class MultipleFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_multiple_fragment);
        if (savedInstanceState == null){ getSupportFragmentManager().beginTransaction()
                .add(R.id.menuContainer, new MenuFragment()).commit();
        }
    }
}
