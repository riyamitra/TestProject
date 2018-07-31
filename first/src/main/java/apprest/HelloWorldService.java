package apprest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import app.Address;
import app.AppUser;
import app.UserProfile;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/getUser")
	public Response getMsg(@QueryParam("user_id") Integer user_id ) {

		Set<Address> address = new HashSet<Address>();
		List<String> emails = new ArrayList<String>();

		// this is the place where i create and add address
		Address home_address = new Address("Flat no 204", "devinagar", "bangalore", "Tatanagar", "Karnataka", "india",
				"560092");
		Address office_address = new Address("Istar SKill develpment pvt ltd", "makam plaza", "bangalore",
				"Malleswaram", "Karnataka", "india", "560055");
		address.add(home_address);
		address.add(office_address);

		// this is where i create emails

		emails.add("feroz@istarindia.com");
		emails.add("hhh@istarindia.com");

		UserProfile userProfile = new UserProfile(1, "Kamini devi", "female", "12345678", address, emails);
		AppUser appUser = new AppUser(user_id, "kam196", "test123", userProfile);
		Gson gson = new Gson();
		System.out.println(gson.toJson(appUser));
		return Response.status(200).entity(gson.toJson(appUser)).build();

	}

}