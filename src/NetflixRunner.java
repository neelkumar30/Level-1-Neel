
public class NetflixRunner {
	public static void main(String[] args) {
		//1. Instantiate some Movie objects (at least 5).
		Movie movie = new Movie("Thor",5);
		Movie movie2 = new Movie("Justice League",4);
		Movie movie3 = new Movie("Superman",1);
		Movie movie4 = new Movie("Batman",2);
		Movie movie5 = new Movie("Wonder Woman",3);
		//2. Use the Movie class to get the ticket price of one of your movies.
		movie.getTicketPrice();
		//3. Instantiate a NetflixQueue.
		NetflixQueue hi = new NetflixQueue();
		//4. Add your movies to the Netflix queue.
		hi.addMovie(movie);
		hi.addMovie(movie2);
		hi.addMovie(movie3);
		hi.addMovie(movie4);
		hi.addMovie(movie5);
		//5. Print all the movies in your queue.
		hi.printMovies();
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		System.out.println("The best movie is " + hi.getBestMovie());
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		hi.sortMoviesByRating();
		System.out.println("The second best movie is " + hi.getMovie(1));

	}

}
