package com.example.when2meet.Retrofit;

import com.example.when2meet.Retrofit.Models.Model__PostSchedule;
import com.example.when2meet.Retrofit.Models.Model__Profile;
import com.example.when2meet.Retrofit.Models.Model__PutSchedule;
import com.example.when2meet.Retrofit.Models.Model__Schedule;
import com.example.when2meet.Retrofit.Models.Model__Timeslot;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitAPI {
    @DELETE("api/schedules/{scheduleId}/{userId}")
    Call<Model__Schedule> deleteSchedule(@Path("scheduleId") String scheduleId, @Path("userId") String userId);

    @PUT("api/schedules/{scheduleId}")
    Call<Model__PutSchedule> putToSchedule(@Path("scheduleId") String scheduleId, @Body Model__PutSchedule schedule);

    @POST("api/schedules/")
    Call<Model__PostSchedule> postSchedule(@Body Model__PostSchedule modelSchedule);

    @FormUrlEncoded
    @POST("api/profiles")
    Call<Model__Profile> postProfile(@Field("userId") Long userId, @Field("name") String name,
                                     @Field("imageUrl") String imageUrl, @Field("email") String email);

    @GET("api/profiles/userId/{userId}")
    Call<Model__Profile> getProfileWithId(@Path("userId") String userId);

    @GET("api/timeslots/{timeslotId}")
    Call<Model__Timeslot> getTimeslotWithId(@Path("timeslotId") String timeslotId);

    @GET("api/schedules")
    Call<List<Model__Schedule>> getAllSchedules();

    @GET("api/schedules/scheduleId/{scheduleId}")
    Call<Model__Schedule> getScheduleWithId(@Path("scheduleId") String scheduleId);
}