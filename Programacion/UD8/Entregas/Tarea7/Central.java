package Ejercicios.Tarea7;

import Ejercicios.Tarea6.Futbolista;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface Central {
    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> listFutbolista();
}
