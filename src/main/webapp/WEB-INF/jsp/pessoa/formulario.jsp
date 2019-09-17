<%@ include file="../../header.jsp" %> 

<div class="container mt-5">    
    <div class="jumbotron">
        <div class="col-md-12 pb-4">
            <c:choose>
                <c:when test="${not empty pessoa.id}">
                    <h2><a href="/samir-project/"></a> Alterar Funcionário: ${pessoa.nome}</h2>
                </c:when>
                <c:otherwise>
                    <h2><a href="/samir-project/"></a> Adicionar Funcionário</h2>
                </c:otherwise>
            </c:choose>                       
        </div>
        <div class="col-md-12 py-2">
            <c:choose>
                <c:when test="${not empty pessoa.id}">
                    <form action="alterar" method="post">
                    </c:when>
                    <c:otherwise>
                        <form action="adicionar" method="post">
                        </c:otherwise>
                    </c:choose>
                    <input type="hidden" name="pessoa.id" value="${pessoa.id}" />
                    <div class="col-md-12">
                        Nome: <input class="form-control" type="text" name="pessoa.nome" value="${pessoa.nome}"> 
                    </div>
                    <div class="col-md-12 py-4">
                        Salário: <input class="form-control" type="text" name="pessoa.salarioBruto" value="${pessoa.salarioBruto}"> 
                    </div>
                    <br />
                    <c:choose>
                        <c:when test="${not empty pessoa.id}">
                            <button class="btn btn-primary" type="submit"> <i class="fas fa-edit"></i> Alterar </button>
                        </c:when>
                        <c:otherwise>
                            <button class="btn btn-success" type="submit"> <i class="fas fa-plus"></i> Cadastrar</button>
                        </c:otherwise>
                    </c:choose>
                    <a class="btn btn-info" href="<c:url value='/pessoa/lista'/>"> Listar Funcionários </a>
                </form>
                <br />
                <c:choose>
                    <c:when test="${not empty adicionado}">
                        <div class="alert alert-success">${adicionado}</div>
                    </c:when>

                    <c:when test="${not empty alterado}">
                        <div class="alert alert-success"> ${alterado}</div>
                    </c:when>
                </c:choose>                
        </div>   
    </div>
</div>                    
<%@ include file="../../footer.jsp" %> 