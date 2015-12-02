package com.companyname.jdbc;

import java.sql.SQLException;

import com.companyname.jdbc.beans.Movie;

public class Program {


	public static void main(String[] args) throws SQLException {
		//MovieListController.displayAllRows();
		
		//READ
		/*
		System.out.println("------------------------------------");
		System.out.println("Read a Row of Data");
		System.out.println("------------------------------------");
		int readId = InputHelper.getIntegerInput("Select a Row to read: ");
		Movie readMovie = MovieListController.getRow(readId);
		
		if(readMovie == null) {
			System.err.println("No Rows where found");
		} else {
			System.out.println("Movie id: " + readMovie.getId());
			System.out.println("Movie Name: " + readMovie.getName());
			System.out.println("Movie Description: " + readMovie.getDescription());
			System.out.println("Movie Release Date: " + readMovie.getReleaseDate());
			System.out.println("Movie Rating: " + readMovie.getRating());
			System.out.println("Movie Genre: " + readMovie.getGenre());
		} // end READ
		*/

		//INSERT or CREATE
		/*
		System.out.println("------------------------------------");
		System.out.println("Insert a row of data");
		System.out.println("------------------------------------");
		Movie insertMovie=new Movie();
		
		
		try {
			insertMovie.setName(InputHelper.getStringInput("Enter Movie Name: "));
			insertMovie.setDescription(InputHelper.getStringInput("Enter a description:" ));
			insertMovie.setReleaseDate(InputHelper.getDateInput("Movie Release Date (YYYY-MM-DD): "));
			insertMovie.setGenre(InputHelper.getStringInput("Enter a movie genre: "));
			
			boolean result=MovieListController.insertRow(insertMovie);
			
			if(result)
			{
				System.out.println("New row with primary key "+insertMovie.getId()+ " was inserted");
			}
		} catch (Exception e) {
			System.err.println("Invalid input");
		}//End of insert
		*/
		
		//UPDATE 
		/*
		System.out.println("------------------------------------");
		System.out.println("Update a row of data");
		System.out.println("------------------------------------");
		int movieId=InputHelper.getIntegerInput("Select a row  to update");
		
		Movie updateMovie=MovieListController.getRow(movieId);
		if(updateMovie==null)
		{
			System.err.println("Row not found");
			return;
		}
		
		Double updateRating =InputHelper.getDoubleInput("Enter a new Movie Rating");
		updateMovie.setRating(updateRating);
		
		try {
			if(MovieListController.updateRow(updateMovie))
			{
				System.out.println("Row "+movieId+ " was successfully updated");
			}
		} catch (Exception exception) {
			System.err.println(exception);
		} // End of update
		*/
		
		//DELETE
		System.out.println("------------------------------------");
		System.out.println("Delete a row of data");
		System.out.println("------------------------------------");
		int deleteId=InputHelper.getIntegerInput("Select a row to delete");
		
		try {
			if(MovieListController.deleteRow(deleteId))
			{
				System.out.println("Row "+deleteId+" was successfully deleted");
			}
			else {
				System.err.println("Nothing to delete");
			}
		} catch (Exception exception) {
			System.err.println(exception);
		}
		
	} 

}