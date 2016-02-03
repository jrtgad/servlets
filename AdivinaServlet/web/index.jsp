<%@page contentType="text/html" pageEncoding="UTF-8"%>
<H1>Guessing Game</H1>
    <%
        int attempts = 1;
        int target = 0;
        int guess = -1;
        if (session.isNew()) {
            target = (int) (Math.random() * 100);
            out.println("Welcome to Guessing Game");
            session.setAttribute("target", "" + target);
            session.setAttribute("attempts", "1");
        } else {
            target = Integer.parseInt(
                    session.getAttribute("target").toString());
            attempts
                    = Integer.parseInt(
                            session.getAttribute("attempts").toString());
            attempts++;
            session.setAttribute("attempts", "" + attempts);
            guess = Integer.parseInt(request.getParameter("guess"));
        }
    %>
Number of attempts <%= attempts%>
<BR>
<%
    if (guess == target) {
        out.println(
                "Congratulations! you got it. Lets start a new game!");
        target = (int) (Math.random() * 100);
        session.setAttribute("target", "" + target);
        session.setAttribute("attempts", "1");
    } else if (guess < target) {
        out.println("Aim higher");
    } else {
        out.println("Aim lower");
    }
%>
<BR>
<FORM action="http:Guess.jsp" method="POST" >
    Enter your guess:
    <INPUT id="guessInput" type="text" name="guess"/>
    <INPUT type="submit" value="Send"/>
</FORM>
<SCRIPT>
    document.all.guessInput.focus();
</SCRIPT>
