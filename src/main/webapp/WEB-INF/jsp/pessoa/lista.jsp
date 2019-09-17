<%@ include file="../../header.jsp" %> 
<div class="container mt-5">
    <div class="row">
        <div class="col-md-6 py-2">
            <h2><a href="/samir-project/"></a> <i class="fas fa-list"></i> Lista de Funcionários</h2>
        </div>
        <div class="col-md-6 py-2 text-right">
            <a class="btn btn-success" href="<c:url value='/pessoa/formulario'/>"> <i class="fa fa-plus"> </i> Adicionar Funcionário</a>
        </div>

        <div class="col-md-12">
            <table class="table table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col"> <i class="fas fa-user"></i> Nome</th>
                        <th scope="col" class="text-center"> <i class="fas fa-wrench"></i> Ações</th>                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${pessoaList}" var="pessoa">
                        <tr>
                            <td>${pessoa.nome}</td>
                            <td class="text-center">
                                <a class="btn btn-primary" href="editar?id=${pessoa.id}"> <i class="fas fa-edit"></i> Alterar</a>
                                <a class="btn btn-info" href="../folhaPagamento"> <i class="fas fa-file"></i> Folha de Pagamento</a>
                                <a class="btn btn-danger" href="remover?id=${pessoa.id}"> <i class="fas fa-trash"></i> Remover</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <c:choose>
            <c:when test="${not empty deletado}">
                <div class="alert alert-success">${deletado}</div>
            </c:when>
        </c:choose>            
    </div>

    <style>
        th{
            width: 250px !important;
        }
    </style>


    <%@ include file="../../footer.jsp" %> 