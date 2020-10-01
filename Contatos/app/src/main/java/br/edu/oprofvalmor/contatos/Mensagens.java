package br.edu.oprofvalmor.contatos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Mensagens extends Fragment {

    public Mensagens() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mensagens, container, false);
    }
}

//public class Mensagens extends Fragment {
//
//    List<String> lista;
//    MyAdapter myAdapter;
//
//    public Mensagens () {
//        super();
//    }
//
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_mensagens, container, false);
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        Button botaoEnviarMensagem = getActivity().findViewById(R.id.btEnviar);
//        final EditText edtUserId = getActivity().findViewById(R.id.username);
//        botaoEnviarMensagem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Thread r = new Thread() {
//                    @Override
//                    public void run() {
//                        Application.getInstance().enviarMensagemLogin(edtUserId.getText().toString());
//                    }
//                };
//                r.start();
//            }
//        });
//        super.onStart();
//        ListView listaMensagens= getActivity().findViewById(R.id.listaMensagens);
//        myAdapter = new MyAdapter();
//        listaMensagens.setAdapter(myAdapter);
//        //
//        ListaMensagens.getListaDeMensagens().addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(final Observable sender, int propertyId) {
//                Runnable r = new Runnable() {
//                    @Override
//                    public void run() {
//                        lista = ((ObservableField<List<String>>)sender).get();
//                        myAdapter.notifyDataSetChanged();
//                    }
//                };
//                getActivity().runOnUiThread(r);
//            }
//        });
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
//
//    class MyAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            if(lista != null) return lista.size();
//            return 0;
//        }
//
//        @Override
//        public Object getItem(int i) {
//            if(lista != null) return lista.get(i);
//            return null;
//        }
//
//        @Override
//        public long getItemId(int i) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View view, ViewGroup container) {
//            if (view == null) {
//                view = getLayoutInflater().inflate(R.layout.linha_mensagens, container, false);
//            }
//            if(lista != null) {
//                String nomePessoa = lista.get(1);
//                String txtMensagem = lista.get(2);
//
//                ((TextView) view.findViewById(R.id.nomePessoa)).setText((nomePessoa));
//                ((TextView) view.findViewById(R.id.textmensagem)).setText(txtMensagem);
//            }
//
//            return view;
//        }
//    }
//}