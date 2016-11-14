package sillyv.com.sillycounter.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

public abstract class GeneralFragment extends Fragment {

    private FragmentContracts.ParentActivityContract mListener;

    public GeneralFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentContracts.ParentActivityContract) {
            mListener = (FragmentContracts.ParentActivityContract) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public FragmentContracts.ParentActivityContract getListener() {
        return mListener;
    }
}
