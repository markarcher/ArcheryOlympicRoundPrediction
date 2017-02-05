package com.olympicRndBracketPrediction.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.olympicRndBracketPrediction.domain.OlympicRound;
import com.olympicRndBracketPrediction.service.PerdictionService;
import com.olympicRndBracketPrediction.service.PerdictionServiceImpl;

/**
 * Servlet implementation class Prediction
 */
@WebServlet("/Prediction")
public class Prediction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prediction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String archerName1 = request.getParameter("archerName1");
		String archerName1Rank = request.getParameter("archerName1Rank");
		String archerName2 = request.getParameter("archerName2");
		String archerName2Rank = request.getParameter("archerName2Rank");
		String archerName3 = request.getParameter("archerName3");
		String archerName3Rank = request.getParameter("archerName3Rank");
		String archerName4 = request.getParameter("archerName4");
		String archerName4Rank = request.getParameter("archerName4Rank");
		String competitionFormat = request.getParameter("competitionFormat");
		OlympicRound olympicRound = new OlympicRound(archerName1Rank,archerName2Rank,
				archerName3Rank,archerName4Rank,competitionFormat,false,"");
		PerdictionService predictionService = new PerdictionServiceImpl();
		
		predictionService.calculateMatchUp(olympicRound);
	
		RequestDispatcher rd = getServletContext()
				.getRequestDispatcher("/prediction.jsp");
				rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
